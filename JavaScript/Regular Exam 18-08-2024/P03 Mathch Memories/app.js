function matchMemories(){

    const baseURL = 'http://localhost:3030/jsonstore/matches/';

    let loadMatchesBtn = document.getElementById('load-matches');
    let addMatchBtn = document.getElementById('add-match');
    let editMatchBtn = document.getElementById('edit-match');

    async function loadMatches (){
        let response = await fetch(baseURL);
        let info = await response.json();
        document.getElementById('list').innerHTML = '';

        for (const [id,match] of Object.entries(info)) {

            let hostName = document.createElement('p');
            hostName.textContent = match.host;
            let score = document.createElement('p');
            score.textContent = match.score;
            let guestName = document.createElement('p');
            guestName.textContent = match.guest;

            let matchesButtons = document.createElement('div');
            matchesButtons.classList.add('btn-wrapper');

            let changeMatchBtn = document.createElement('button');
            let deleteMatchBtn = document.createElement('button');

            changeMatchBtn.classList.add('change-btn');
            deleteMatchBtn.classList.add('delete-btn');
            changeMatchBtn.textContent = 'Change';
            deleteMatchBtn.textContent = 'Delete';

            matchesButtons.appendChild(changeMatchBtn);
            matchesButtons.appendChild(deleteMatchBtn);

            let matchContainer = document.createElement('div');
            matchContainer.classList.add('match');
            matchContainer.appendChild(hostName);
            matchContainer.appendChild(score);
            matchContainer.appendChild(guestName);
            matchContainer.appendChild(matchesButtons);

            document.getElementById('list').appendChild(matchContainer);

            //започвам да правя бутони.
            deleteMatchBtn.addEventListener('click',async() => {
                await fetch(`${baseURL}${match._id}`, {
                    method: 'DELETE',
                });
                await loadMatches();
            })

            changeMatchBtn.addEventListener('click', async (qualifiedName, value) => {
                addMatchBtn.disabled = true;
                editMatchBtn.disabled = false;

                document.getElementById('host').value = match.host;
                document.getElementById('score').value = match.score;
                document.getElementById('guest').value = match.guest;

                document.querySelector('#form form').setAttribute('data-match-id',match._id);

                let inputHost = document.getElementById('host').value;
                let inputScore = document.getElementById('score').value;
                let inputGuest = document.getElementById('guest').value;

                await fetch(`${baseURL}${id}`, {
                    method: 'PUT',
                    headers:{'Content-Type':'application/json'},
                    body:JSON.stringify({host:inputHost,score:inputScore,guest:inputGuest,_id:id}),
                });
                await loadMatches();
            })
        }
    }
    async function addMatch(){
        const hostInput = document.getElementById("host").value;
        const scoreInput = document.getElementById("score").value;
        const guestInput = document.getElementById("guest").value;

        await fetch(baseURL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                host: hostInput,
                score: scoreInput,
                guest: guestInput,
            }),
        });

        clearInputsFunction();
        await loadMatches();


    }
    async function editMatch(){
        const id = document.querySelector('#form form').getAttribute('data-match-id');
        let host = document.getElementById('host').value;
        let score = document.getElementById('score').value;
        let guest = document.getElementById('guest').value;

        await fetch(`${baseURL}${id}`, {
            method: 'PUT',
            headers:{'Content-Type':'application/json'},
            body:JSON.stringify({host,score,guest,_id:id}),
        });

        clearInputsFunction();
        await loadMatches();
        document.querySelector('#form form').removeAttribute('data-match-id');
    }
    function clearInputsFunction(){
        document.getElementById('host').value = '';
        document.getElementById('score').value = '';
        document.getElementById('guest').value = '';
    }

    loadMatchesBtn.addEventListener('click',loadMatches);
    addMatchBtn.addEventListener('click',addMatch);
    editMatchBtn.addEventListener('click',editMatch);

}
matchMemories();
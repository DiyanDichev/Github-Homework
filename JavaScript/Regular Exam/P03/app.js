function solve(){

    const baseURL = 'http://localhost:3030/jsonstore/tasks/';

    let loadBtn = document.getElementById('load-meals');
    let addBtn = document.getElementById('add-meal');
    let editBtn = document.getElementById('edit-meal');

    async function load(qualifiedName, value){
        let response = await fetch(baseURL);
        let info = await response.json();
        document.getElementById('list').innerHTML = '';

        for (const [id,meal] of Object.entries(info)) {

            let mealName = document.createElement('h2');
            mealName.textContent = meal.food;
            let mealTime = document.createElement('h3');
            mealTime.textContent = meal.time;
            let mealCalories = document.createElement('h3');
            mealCalories.textContent = meal.calories;

            let mealButtons = document.createElement('div');
            mealButtons.classList.add('meal-buttons');

            let changeMealBtn = document.createElement('button');
            let deleteMealBtn = document.createElement('button');

            changeMealBtn.classList.add('change-meal');
            deleteMealBtn.classList.add('delete-meal');
            changeMealBtn.textContent = 'Change';
            deleteMealBtn.textContent = 'Delete';

            mealButtons.appendChild(changeMealBtn);
            mealButtons.appendChild(deleteMealBtn);

            let mealContainer = document.createElement('div');
            mealContainer.classList.add('meal');
            mealContainer.appendChild(mealName);
            mealContainer.appendChild(mealTime);
            mealContainer.appendChild(mealCalories);
            mealContainer.appendChild(mealButtons);

            document.getElementById('list').appendChild(mealContainer);

            //започвам да правя бутони.
            deleteMealBtn.addEventListener('click',async() => {
                await fetch(`${baseURL}${meal._id}`, {
                    method: 'DELETE',
                });
                await load();
            })

            changeMealBtn.addEventListener('click', async (qualifiedName, value) => {
                addBtn.disabled = true;
                editBtn.disabled = false;

                document.getElementById('food').value = meal.food;
                document.getElementById('time').value = meal.time;
                document.getElementById('calories').value = meal.calories;

                document.querySelector('#form form').setAttribute('data-meal-id',meal._id);

                let inputFood = document.getElementById('food').value;
                let inputTime = document.getElementById('time').value;
                let inputCalories = document.getElementById('calories').value;

                await fetch(`${baseURL}${id}`, {
                    method: 'PUT',
                    headers:{'Content-Type':'application/json'},
                    body:JSON.stringify({food:inputFood,time:inputTime,calories:inputCalories,_id:id}),
                });
                await load();
            })
        }
    }
    async function addMeal(){
        const foodInput = document.getElementById("food").value;
        const timeInput = document.getElementById("time").value;
        const caloriesInput = document.getElementById("calories").value;

        await fetch(baseURL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                food: foodInput,
                time: timeInput,
                calories: caloriesInput,
            }),
        });

        clear();
        await load();


    }
    async function editMeal(){
        const id = document.querySelector('#form form').getAttribute('data-meal-id');
        let food = document.getElementById('food').value;
        let time = document.getElementById('time').value;
        let calories = document.getElementById('calories').value;

        await fetch(`${baseURL}${id}`, {
            method: 'PUT',
            headers:{'Content-Type':'application/json'},
            body:JSON.stringify({food,time,calories,_id:id}),
        });

        clear();
        await load();
        document.querySelector('#form form').removeAttribute('data-meal-id');
    }
    function clear(){
        document.getElementById('food').value = '';
        document.getElementById('time').value = '';
        document.getElementById('calories').value = '';
    }

    loadBtn.addEventListener('click',load);
    addBtn.addEventListener('click',addMeal);
    editBtn.addEventListener('click',editMeal);

}
solve();
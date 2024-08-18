function attachEvents() {

    const baseURL = 'http://localhost:3030/jsonstore/phonebook/';

    document.getElementById('btnLoad').addEventListener('click', getAllPhones);
    document.getElementById('btnCreate').addEventListener('click', createContact);

    async function getAllPhones() {
        const phonesInfo = await (await fetch(baseURL)).json();
        const phoneBook = document.getElementById('phonebook');
        Object.values(phonesInfo).forEach((contact) => {
            const li = document.createElement('li');
            const delButton = document.createElement('button');
            delButton.textContent = 'Delete';

            li.textContent = `${contact.person}: ${contact.phone}`;
            li.appendChild(delButton);
            phoneBook.appendChild(li);

            delButton.addEventListener('click', deleteContact);

            function deleteContact() {
                const id = contact._id;

                fetch(`http://localhost:3030/jsonstore/phonebook/${id}`, {
                    method: 'DELETE',
                });
                li.remove();
            }
        });
    }

    function createContact() {
        const person = document.getElementById('person').value;
        const phone = document.getElementById('phone').value;
        fetch(baseURL, {
            method: 'POST',
            body: JSON.stringify(
                {
                    person,
                    phone
                }
            )
        })
            .then((response)=> response.json())
            .then(() =>{

                document.getElementById('person').value = '';
                document.getElementById('phone').value = '';
                getAllPhones();
            })
    }
}

attachEvents();
function deleteByEmail() {
    const inputElement = document.querySelector('input[name="email"]');
    const tableRows = Array.from(document.querySelector('tbody').children);
    const resultElement = document.querySelector('#result');
    let isRemoved = false;

    for (const row of tableRows) {
        const  emailCell = row.children[1];

        if(emailCell.textContent === inputElement.value){
            row.remove();
            isRemoved = true;
        }

    }
    if(isRemoved){
        resultElement.textContent = 'Deleted';
    }else {
        resultElement.textContent = 'Not found.';
    }
}
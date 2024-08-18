function focused() {
const fields = Array.from(document.getElementsByTagName('input'));

    for (const field of fields) {
        field.addEventListener("focus",onFocus);
        field.addEventListener("blur", onBlur);
    }

    function onFocus(e){
        const  divParentElement = e.currentTarget.parentNode;
        divParentElement.classList.add('focused');
    }

    function  onBlur(e){
        const  divParentElement = e.currentTarget.parentNode;
        divParentElement.classList.remove('focused');
    }
}
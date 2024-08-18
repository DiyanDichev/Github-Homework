function subtract() {
    const firstNumber = Number(document.getElementById('firstNumber').value);
    const secondNumber = Number(document.getElementById('secondNumber').value);
    let result = document.getElementById('result');
    result.innerText = firstNumber - secondNumber;

}
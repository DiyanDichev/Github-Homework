function attachGradientEvents() {
    const gradient = document.getElementById('gradient');
    const resultElement = document.getElementById('result');

    gradient.addEventListener('mousemove', gradientMove);
    gradient.addEventListener('mouseout', gradientOut);

    function gradientMove(e) {
        let power = e.offsetX / (e.target.clientWidth - 1);
        power = Math.trunc(power * 100);
        resultElement.textContent = power + "%";
    }

    function gradientOut(e) {
    resultElement.textContent = "";
    }
}
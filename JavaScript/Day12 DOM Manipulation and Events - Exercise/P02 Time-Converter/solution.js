function attachEventsListeners() {
    let days = document.querySelector('#days');
    let daysButton = document.querySelector('#daysBtn');

    let hours = document.querySelector('#hours');
    let hoursButton = document.querySelector('#hoursBtn');

    let minutes = document.querySelector('#minutes');
    let minutesButtons = document.querySelector('#minutesBtn');

    let seconds = document.querySelector('#seconds');
    let secondsButton = document.querySelector('#secondsBtn');

    daysButton.addEventListener('click', daysConvert);
    hoursButton.addEventListener('click', hoursConvert);
    minutesButtons.addEventListener('click', minutesConvert);
    secondsButton.addEventListener('click', secondsConvert);

    function daysConvert() {
        hours.value = days.value * 24;
        minutes.value = hours.value * 60;
        seconds.value = minutes.value * 60;
    }
    function hoursConvert() {
        days.value = hours.value / 24;
        minutes.value = hours.value * 60;
        seconds.value = minutes.value * 60;
    }
    function minutesConvert() {
        hours.value = minutes.value / 60;
        days.value = hours.value / 24;
        seconds.value = minutes.value * 60;
    }
    function secondsConvert() {
        minutes.value = seconds.value / 60;
        hours.value = minutes.value / 60;
        days.value = hours.value / 24;
    }
}
function passwordValidator(password) {

    function isValidLength(text) {
        return text.length >= 6 && text.length <= 10;
    }

    if (!isValidLength(password)) {
        console.log('Password must be between 6 and 10 characters');
    }

    function isAlphanumeric(text) {
        let regex = /^[a-zA-Z0-9]+$/;
        let isCorrect = regex.test(text);

        return isCorrect;
    }

    if (!isAlphanumeric(password)) {
        console.log('Password must consist only of letters and digits');
    }

    function countDigits(text) {
        let digitsCounter = 0;

        for (const digits of text) {
            if (!isNaN(digits)) {
                digitsCounter++;
            }
        }
        return digitsCounter >= 2;
    }
    if (!countDigits(password)) {
        console.log('Password must have at least 2 digits');
    }

    if(isValidLength(password) && isAlphanumeric(password) && countDigits(password)){
        console.log('Password is valid');
    }
}
function encodeAndDecodeMessages() {
    let encodeTextBox = document.getElementsByTagName('textarea')[0];
    let encodeBtn = document.getElementsByTagName('button')[0];

    let decodeTextBox = document.getElementsByTagName('textarea')[1];
    let decodeBtn = document.getElementsByTagName('button')[1];

    encodeBtn.addEventListener('click',encodeMessage);
    decodeBtn.addEventListener('click',decodeMessage);

    function encodeMessage(){
        let message = encodeTextBox.value;
        let newMessage = '';

        for (let i = 0; i < message.length; i++) {
            let newText = String.fromCodePoint(message[i].charCodeAt(0) + 1);
            newMessage += newText;
        }
        decodeTextBox.value = newMessage;
        encodeTextBox.value = '';
        document.getElementsByTagName('button')[1].disabled = false;
    }
    function decodeMessage(){
        let message = decodeTextBox.value;
        let newMessage = '';

        for (let i = 0; i < message.length; i++) {
            let newText = String.fromCodePoint(message[i].charCodeAt(0) - 1);
            newMessage += newText;
        }

        decodeTextBox.value = newMessage;
        document.getElementsByTagName('button')[1].disabled = true;
    }
}
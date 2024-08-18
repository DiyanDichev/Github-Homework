function solve() {
    let rawText = document.getElementById('input').value;
    let outputElement = document.getElementById('output');

    let sentences = rawText.split('.');
    sentences = sentences.filter(s => s.length > 0)
        .map(s => s += '.');

    while (sentences.length > 0){
        let p = document.createElement('p');

        p.textContent = sentences.splice(0,3).join('');

        outputElement.appendChild(p);
    }
}
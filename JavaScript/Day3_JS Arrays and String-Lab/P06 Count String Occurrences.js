function solve(text, search){
    let words = text.split(' ');
    let counter = 0;

for(const word of words) {
    if(word === search) counter++;
}

console.log(counter);

}
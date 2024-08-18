function arrayString(array, step){
    let output = [];
    let arrayLength = array.length;

    for (let index = 0; index < array.length; index += step) {
        let currentNumber = array[index];
        output.push(currentNumber);
        
    }
    return output;
}

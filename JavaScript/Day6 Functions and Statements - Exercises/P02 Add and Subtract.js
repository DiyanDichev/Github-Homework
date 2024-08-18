function smallestNumber(first, second, last){

    let sum = (first, second) => {
        return first + second;
    };

    let subtract = (sum, lastNumber) => {
        return sum - lastNumber;
    };

    console.log(subtract(sum(first, second), last));
}
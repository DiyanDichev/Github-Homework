function rotation(arr, rotations){

    for(let index = 0; index < rotations; index++){
        arr.push(arr.shift());
    }

    console.log(arr.join(' '))
}
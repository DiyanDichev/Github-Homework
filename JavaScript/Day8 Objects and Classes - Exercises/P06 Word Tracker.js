function solve(list) {

    let stringList = list.shift().split(' ');

    let occurrences = {};

    stringList.forEach((word) => {
        occurrences[word] = 0;
        list.forEach((element) => {
            if (word === element) {
                occurrences[word] += 1;
            }
        });
    });

    let entries = Object.entries(occurrences).sort((a, b) => b[1] - a[1]);

    for (const [key,value] of entries) {
        console.log(`${key} - ${value}`);
    }
}
function solve(input){

    const dictionary = input.map(JSON.parse);
    let newDictionary = {};

    for (const element of dictionary) {
        const word = Object.keys(element)[0];
        newDictionary[word] = element[word];
    }
    Object.entries(newDictionary).sort((a,b) => a[0].localeCompare(b[0])).forEach(([key,value]) => console.log(`Term: ${key} => Definition: ${value}`));
}
function printJsonObj(firstName, lastName, hairColor){
const person = {name: firstName, lastName, hairColor};
const objectAsJson = JSON.stringify(person);
console.log(objectAsJson);
}
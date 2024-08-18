function getAddresses(input){
    const addressList = {};

    for (const person of input) {
        const [name, adress] = person.split(":");
        addressList[name] = adress;
    }

    const peopleNames = Object.entries(addressList);
    const sortedPeople = peopleNames.sort();

    for (const key of sortedPeople) {
        console.log(`${key[0]} -> ${key[1]}`);
    }
}
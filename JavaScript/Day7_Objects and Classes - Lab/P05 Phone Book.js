function getPhoneBook(arr){
    const phoneBook = {};

    for (const element of arr) {
        const [name, phone] = element.split(" ");
        phoneBook[name] = phone;
    }

    for (const key in phoneBook) {
        console.log(`${key} -> ${phoneBook[key]}`);
    }
}
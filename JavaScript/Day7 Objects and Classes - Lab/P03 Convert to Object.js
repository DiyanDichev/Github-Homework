function convertToObject(jsonObj) {
    const obj = JSON.parse(jsonObj);

    for (const element of Object.entries(obj)) {
        const [key, value] = element;
        console.log(`${key}: ${value}`);
    }
}
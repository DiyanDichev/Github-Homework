function solve(currentStock, orderedProducts) {

    const stock = {};
    for (let index = 0; index < currentStock.length; index+=2) {
        const product = currentStock[index];
        let quantity = Number(currentStock[index + 1]);

        if(!stock.hasOwnProperty(product)){
            stock[product] = quantity;
        }else{
            stock[product] += quantity;
        }
    }

    for (let index = 0; index < orderedProducts.length; index+=2) {
        const product = orderedProducts[index];
        let quantity = Number(orderedProducts[index + 1]);

        if(!stock.hasOwnProperty(product)){
            stock[product] = quantity;
        }else{
            stock[product] += quantity;
        }
    }
    for (const product in stock) {
            console.log(`${product} -> ${stock[product]}`);
    }
}
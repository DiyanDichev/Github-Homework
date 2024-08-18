function solve(towns) {

    for (const currentTown of towns) {
        let [town, latitude, longitude] = currentTown.split(' | ');

        let currentTownInfo = {
            town,
            latitude: Number(latitude).toFixed(2),
            longitude: Number(longitude).toFixed(2)
        };

        console.log(currentTownInfo);
    }
}

const person = {
    name: 'Aditya', 
    age: 21,
    address: {
        city: 'Kuchaman', 
        district: 'Nagaur',
        state: 'Rajasthan'
    },
    bike: {
        company: 'Royal Enfield', 
        model: 'Classic 350, Chrome Bronze',
        engine: 350 
    },
    gadgets: ['Macbook 14 pro', 'Samsung Galaxy Z-Flip 5', 'Ipad pro'],
    bikeInfo: () => {
        console.log(person.bike.company)
        console.log(person.bike.model)
        console.log(person.bike.engine)
    },
    showGadgets: () => {
        person.gadgets.map(
            gadget => console.log(gadget) 
        )
    }
}


function PersonInfo() {
    return (
        <>
        <div>Name: {person.name}</div>
        <div>Age: {person.age}</div>
        <div>Bike and Gadget Info are in logs!! </div>
        <div>{[person.showGadgets()]}</div>
        <div>{person.bikeInfo()}</div>
        </>
    )
}

export {PersonInfo};

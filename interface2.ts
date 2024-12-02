interface Person{
    firstname: string;
    lastname: string;
    sayHi: () => string;
}
let customer : Person = {
    firstname: "Tarun",
    lastname: "Verma",
    sayHi: () : string => {return "Hey you are new customer here !!"}
}
console.log(customer.firstname)
console.log(customer.lastname)
console.log(customer.sayHi())
let employee : Person = {
    firstname: "Kavita",
    lastname: "Agarwal",
    sayHi: () : string => {return "Welcome to office !!"}
}
console.log(employee.firstname)
console.log(employee.lastname)
console.log(employee.sayHi())
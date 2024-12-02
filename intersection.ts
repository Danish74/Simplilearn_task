interface BusinessPartner {
    name: string;
    credit: number;
}
interface Identity{
    id: number;
    city: string;
}
interface Contact{
    email: string;
    phone: number;
}
type Employee1 = Identity & Contact; 
type Customer = Contact & BusinessPartner;
let e : Employee1 = {
    id: 101,
    city: 'Delhi',
    email : 'admin@gmail.com',
    phone: 834383
}
let c : Customer = {
    name: 'Rahul',
    credit: 5656,
    email : 'admin@gmail.com',
    phone: 834383
}
console.log(e.id + ' ' + e.city + ' ' + e.email + ' '+ e.phone)
console.log(c.name + ' ' + c.credit + ' ' + c.email + ' '+ c.phone)
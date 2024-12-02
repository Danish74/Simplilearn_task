type alpha = string | number;
let x: unknown = "35";
let y : unknown = 34;
console.log((x as string));
console.log((x as string).length);
console.log( (<string> x).length)
console.log( (<string> y).length)
console.log( (y as string + " Bye").concat(' See you tomorrow !!'))
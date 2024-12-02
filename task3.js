function calculateDiscountedPrice(product) {
    var price = typeof product.originalPrice === 'string' ? parseFloat(product.originalPrice) : product.originalPrice;
    var discount = typeof product.discountPercentage === 'string' ? parseFloat(product.discountPercentage) : product.discountPercentage;
    return price - (price * discount / 100);
}
function displayProductDetails(product) {
    console.log("Product: ".concat(product.name, " (").concat(product.brand, ")"));
    console.log("Original Price: ".concat(typeof product.originalPrice === 'string' ? product.originalPrice : '$' + product.originalPrice));
    console.log("Discount: ".concat(typeof product.discountPercentage === 'string' ? product.discountPercentage : product.discountPercentage + '%', "%"));
    console.log("Discounted Price: $".concat(calculateDiscountedPrice(product).toFixed(2)));
}
var product1 = {
    name: 'Smartphone',
    brand: 'Apple',
    originalPrice: '999',
    discountPercentage: '10'
};
var product2 = {
    name: 'Laptop',
    brand: 'Dell',
    originalPrice: 1299,
    discountPercentage: 15
};
displayProductDetails(product1);
console.log();
displayProductDetails(product2);

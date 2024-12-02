interface Product {
    name: string;
    brand: string;
    originalPrice: number | string;
    discountPercentage: number | string;
  }
  
  function calculateDiscountedPrice(product: Product): number {
    const price = typeof product.originalPrice === 'string' ? parseFloat(product.originalPrice) : product.originalPrice;
    const discount = typeof product.discountPercentage === 'string' ? parseFloat(product.discountPercentage) : product.discountPercentage;
    
    return price - (price * discount / 100);
  }
  

  function displayProductDetails(product: Product) {
    console.log(`Product: ${product.name} (${product.brand})`);
    console.log(`Original Price: ${typeof product.originalPrice === 'string' ? product.originalPrice : '$' + product.originalPrice}`);
    console.log(`Discount: ${typeof product.discountPercentage === 'string' ? product.discountPercentage : product.discountPercentage + '%'}%`);
    console.log(`Discounted Price: $${calculateDiscountedPrice(product).toFixed(2)}`);
  }
  
  
  const product1: Product = {
    name: 'Smartphone',
    brand: 'Apple',
    originalPrice: '999',
    discountPercentage: '10'
  };
  
  const product2: Product = {
    name: 'Laptop',
    brand: 'Dell',
    originalPrice: 1299,
    discountPercentage: 15
  };
  
  
  displayProductDetails(product1);
  console.log();
  displayProductDetails(product2);
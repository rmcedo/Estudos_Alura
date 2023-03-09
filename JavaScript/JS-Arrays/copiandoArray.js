const notas = [7, 7, 8, 9]

const novasNotas = [...notas] // Spread Operator

novasNotas.push(10)

console.log(`As notas originais são ${notas}`);
console.log(`As novas notas são ${novasNotas}`);
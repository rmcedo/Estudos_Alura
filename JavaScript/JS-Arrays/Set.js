const nomes = ["Ana", "Clara", "Maria", "Maria", "João", "João", "João"]

const meuSet = new Set(nomes)

const nomesAtualizados = [...meuSet] // [ ... new Set(nomes)]
console.log(nomesAtualizados); 
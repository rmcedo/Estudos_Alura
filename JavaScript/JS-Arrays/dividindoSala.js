// ALTERA O ARRAY ORIGINAL => SENDO NECESSÁRIO SALVAR EM OUTRA LISTA O RESULTADO

const alunos = [
    'João',
    'Juliana',
    'Ana', 
    'Caio', 
    'Lara', 
    'Marjorie', 
    'Guilherme', 
    'Aline', 
    'Fabiana', 
    'Andre', 
    'Carlos', 
    'Paulo', 
    'Bia', 
    'Vivian', 
    'Isabela', 
    'Vinícius', 
    'Renan', 
    'Renata', 
    'Daisy', 
    'Camilo'
]

const sala1 = alunos.slice(0, alunos.length/2) // FATIA O ARRAY -> PRIMEIRO PARAMENTRO É ONDE IRÁ INICIAR E O SEGUNDO É O PRIMEIRO DA "NOVA" LISTA
const sala2 = alunos.slice(alunos.length/2)
console.log(sala1);
console.log(sala2);
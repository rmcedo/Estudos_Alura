const notas = [10 , 6.5 , 8 , 7.5]

let somaNota = 0
notas.forEach(nota => {

    somaNota+=nota
    
});

const media = somaNota/notas.length

console.log(media);
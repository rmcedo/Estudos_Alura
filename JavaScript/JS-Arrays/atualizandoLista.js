const nomes = ['João', 'Ana', 'Caio', 'Lara', 'Marjorie', 'Leo']

nomes.splice(1,2, 'Rodrigo') 
//Primeiro parametro é a posição do indice que queremos remover
//Segundo paramentro é a quantidade de itens que quero remover a partir do primeiro parametro
//Terceiro elemento => OPCIONAL = Algo que quero adicionar, colocando no lugar dos elementos que retirei


console.log(nomes);
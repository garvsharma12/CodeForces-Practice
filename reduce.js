var arr = [3,78,65,45,98,24];

var sum = arr.reduce((acc,item,ind)=>{
    return acc+item;
})
console.log(sum);
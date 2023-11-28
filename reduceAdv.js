var arr =[
    {firstName:'govind',lastName:'sharma',age:24},
    {firstName:'govind',lastName:'sharma',age:35},
    {firstName:'govind',lastName:'sharma',age:74},
    {firstName:'govind',lastName:'sharma',age:24},
];

var op = arr.reduce((acc,item)=>{
    if(acc[item.age]){
        acc[item.age]=acc[item.age]+1;
    }
    else{
        acc[item.age]=1;
    }
    return acc;
},{})
console.log(op);
const user = {
  id: 1,
  name: 'k',
  email: 'c',
};

const { id, name, email } = user;

console.log(id, name, email);
// const id = user.id;
// const name = user.name;
// const email = user.email;

const fruits = ['키위', '복숭아', '파인애플'];
const [a, b, c] = fruits;

console.log(fruits);
console.log(...fruits);

function conLog(a, b, c) {
  console.log(a, b, c);
}

conLog(fruits[0], fruits[1], fruits[2]);
conLog(...fruits);

const string = 'apple';
const strArr = string.split('');
const strArr2 = [...string];
console.log(strArr);
console.log(strArr2);

// const copyArr = arr;
// const hardCopyArr = [...arr];

// console.log(arr === copyArr);
// console.log(arr === hardCopyArr);

const person = { name: '김연후', age: 26 };
const job = { title: '개발자', company: '구글' };

const profile = {
  //   name: person.name,
  //   age: person.age,
  ...person,
  ...job,
};

console.log(profile);
// console.log(a, b, c);

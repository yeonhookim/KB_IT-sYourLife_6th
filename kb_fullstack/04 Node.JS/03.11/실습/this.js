// function sayHello() {
//   console.log(`Hello, I'm ${this.name}`);
// }

// const boy = {
//   name: 'Peter',
//   sayHello,
// };

// const girl = {
//   name: 'Jane',
//   sayHello,
// };

// boy.sayHello();
// girl.sayHello();

const sayHello = () => {
  console.log(`Hello, I'm ${this}`);
};

const boy = {
  name: 'Peter',
  sayHello,
};

const girl = {
  name: 'Jane',
  sayHello,
};

boy.sayHello();
girl.sayHello();

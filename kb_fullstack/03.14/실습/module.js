// // const animals = require('./animals');

// const { showAnimals } = require('./animals');

// // // console.log(animals);
// // console.log(animals.animals);
// // animals.showAnimals();

// const { animals, showAnimals } = require('/animals');
// console.log('animals', animals);
// showAnimals();

const animals = {
  animals: ['dog', 'cat'],
  showAnimals() {
    this.animals.map(function (el) {
      console.log('el:', el);
    });
  },
};

module.exports = animals;

const animals = require('./animals');
console.log(animals);
// console.log(animals.animals);
animals.showAnimals();

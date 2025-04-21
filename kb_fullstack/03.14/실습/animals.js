const animals = ['dog', 'tiger'];

exports.animals = animals;

exports.showAnimals = function showAnimals() {
  animals.map(function (el) {
    console.log('el:', el);
  });
};

// module.exports = {
//   animals,
//   showAnimals,
// };

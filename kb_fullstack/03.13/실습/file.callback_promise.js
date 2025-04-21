const fs = require('fs').promises;

fs.readFile('readme.txt')
  .then((data) => {
    console.log('1번째', data.toString());
    return fs.readFile('readme.txt');
  })
  .then((data) => {
    console.log('2번째', data.toString());
    return fs.readFile('readme.txt');
  })
  .then((data) => {
    console.log('3번째', data.toString());
    return fs.readFile('readme.txt');
  })
  .then((data) => {
    console.log('4번째', data.toString());
  })
  //   .catch((err) => {
  //     throw err;
  //   });
  .catch(function (err) {
    console.error(err);
    throw err;
  });

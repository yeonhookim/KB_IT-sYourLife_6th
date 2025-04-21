// 함수 선언문
function add(a, b) {
  return a + b;
}

function toUpperCase(str) {
  return str.toUpperCase();
}

function sumArray(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

// 함수 표현식 변경
const add2 = function (a, b) {
  return a + b;
};

const toUpperCase2 = function (str) {
  return str.toUpperCase();
};

const sumArray2 = function (arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
};

// 화살표 함수 변경
const add3 = (a, b) => {
  return a + b;
};

const toUpperCase3 = (str) => {
  return str.toUpperCase();
};

const sumArray3 = (arr) => {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
};

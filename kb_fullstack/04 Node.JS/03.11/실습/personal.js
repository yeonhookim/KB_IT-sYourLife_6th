const personalInfo = {
  name: '이효석',
  age: `Don't ask this:)`,
  email: 'xenosign@naver.com',
};

const jobInfo = {
  position: '코딩 강사',
  experience: '?년',
};

// console.log('이름: ', name);
// console.log('나이: ', age);
// console.log('이메일: ', email);
// console.log('직책:', position);
// console.log('경력: ', experience);
// console.log('지역:', addr);

const profile = {
  ...personalInfo,
  ...jobInfo,
  addr: '서대문구',
};

const { name, age, email, position, experience, addr } = profile;

console.log(name, age, email, position, experience, addr);

const locationOne = {
  country: 'korea',
};
const locationTwo = {
  country: 'korea',
};

console.log(locationOne === locationTwo);
// 두 개의 주소가 다르기 때문에 false가 뜬다.
// 안에 있을 때의 문구가 같은지는 문자열로 바꾸면 된다.
const jsonLocation1 = JSON.stringify(locationOne); //JSON형태로 변경해주세요
console.log(jsonlocation1);

const jsonLocation2 = JSON.stringify(locationTwo); //JSON형태로 변경해주세요
console.log(jsonlocation2);

console.log(jsonlocation1 === jsonlocation2);

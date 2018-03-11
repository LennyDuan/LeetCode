/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function (nums, target) {
  const diff = [];
  let result = [];
  nums.forEach((ele, index) => {
    console.log(`The ${index} element: ${ele}`);
    if (diff.includes(ele)) {
      const start = diff.indexOf(ele);
      console.log(`!!!!Found start: ${start}`);
      result = [start, index];
      console.log(`Found and return: ${result}`);
      return result;
    }
    const diffNum = target - ele;
    diff.push(diffNum);
    console.log(`The diff array: ${diff}`);
    return null;
  });
  console.log(`The 2 array: \n${nums} \n${diff}`);

  return result;
};

// Use Hash/Map instead of use Array will have much better time performance
const twoSumHash = function (nums, target) {
  const map = {};
  let result = [];
  let find = false;
  nums.forEach((ele, index) => {
    if (find) return;
    const remain = target - ele;
    map[ele] = remain;
    console.log(`The map is: ${JSON.stringify(map)}`);
    if (map[remain]) {
      const start = nums.indexOf(remain);
      if (index !== start) {
        result = [start, index];
        console.log(`Found and result: ${result}`);
        find = true;
      }
    }
  });
  return result;
};

module.exports = {
  twoSum,
  twoSumHash,
};

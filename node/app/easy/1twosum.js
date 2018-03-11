/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function (nums, target) {
  const result = [];
  const diff = [];
  nums.forEach((ele, index) => {
    console.log(`The ${index} element: ${ele}`);
    if (diff.includes(ele)) {
      const end = diff[index];
      return [ele, end];
    }
    const diffNum = target - ele;
    diff.push(diffNum);
  });

  return null;
};

module.exports = {
  twoSum,
};

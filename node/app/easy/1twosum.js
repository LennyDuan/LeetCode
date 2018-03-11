/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  var result = [];
  var diff = [];
  nums.forEach((ele, index) => {
    console.log(`The ${index} element: ${ele}`);
    if(diff.includes(ele)) {
      const end = diff[index];
      return [ele, end];
    }
    const diffNum = target - ele;
    diff.push(diffNum);
  })
  return null;
};

module.exports = {
  twoSum,
};

import { info, debug } from '../../src/util/logger';

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
const findMedianSortedArrays = function (nums1, nums2) {
  debug(`Array One: [${nums1}]`);
  info(`Array Two: [${nums2}]`);
  const all = nums1.length + nums2.length;
  const isOdd = all % 2 !== 0;
  const mid = isOdd ? (all + 1) / 2 : (all / 2) + 1;
  let mediano;
  info(`Mid index should be: ${mid}`);
  let arr = [];
  let i1 = 0;
  let i2 = 0;
  let i = 0;

  for(; i <= mid; i += 1) {
    if(!nums1[i1]) {
      const remain2 = nums2.slice(i2, mid);
      arr = arr.concat(remain2);
      break;
    }
    if(!nums2[i2]) {
      const remain1 = nums1.slice(i1, mid);
      arr = arr.concat(remain1);
      break;
    }

    if (nums1[i1] <= nums2[i2]) {
      arr.push(nums1[i1]);
      info(`Array one: [${nums1[i1]}] is smaller than [${nums2[i2]}]`)
      info(`push [${nums1[i1]}] to array`);
      i1 += 1;
      if(!nums1[i1]) {
        const remain2 = nums2.slice(i2, mid);
        info(`Remain array two: [${remain2}]`);
        arr = arr.concat(remain2);
        info(`New arr: [${arr}]`);
        break;
      }
    } else {
      arr.push(nums2[i2]);
      info(`Array two: [${nums2[i2]}] is smaller than [${nums1[i1]}]`)
      info(`push [${nums2[i2]}] to array`);
      i2 += 1;
      if(!nums2[i2]) {
        const remain1 = nums1.slice(i1, mid);
        info(`Remain array one: [${remain1}]`);
        arr = arr.concat(remain1);
        info(`New arr: [${arr}]`);
        break;
      }
    }
  }


  mediano = isOdd
    ? mediano = arr[i]
    : (arr[i] + arr[i + 1]) / 2;

  return mediano;
};

module.exports = {
  findMedianSortedArrays,
};

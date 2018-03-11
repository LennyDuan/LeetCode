import 'babel-polyfill'
import { addTwoNumbers, twoSumHash } from '../../app/medium/2addTwoNumbers';
import { assert } from 'chai';

describe('addTwoNumbers.js', () => {
  describe('addTwoNumbers', () => {
    it('should complete return [1, 2]', async () => {
      const expect = [1, 2];
      const arr = [3, 2, 4];
      const num = 6;
      const result = twoSum(arr, num);
      assert.deepEqual(expect, result);
    });
  });
});

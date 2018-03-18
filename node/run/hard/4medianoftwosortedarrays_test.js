import { findMedianSortedArrays } from '../../app/hard/4medianoftwosortedarrays';
import { assert } from 'chai';

describe('medium', () => {
  describe('4medianoftwosortedarrays', () => {
    describe('findMedianSortedArrays', () => {
      it('should complete return median = 2.0', async () => {
        const expect = 2.0;
        const nums1 = [1, 3];
        const nums2 = [2];
        const actual = findMedianSortedArrays(nums1, nums2);
        assert.deepEqual(expect, actual);
      });

      it('should complete return median = 2.5', async () => {
        const expect = 2.5;
        const nums1 = [1, 2];
        const nums2 = [3, 4];
        const actual = findMedianSortedArrays(nums1, nums2);
        assert.deepEqual(expect, actual);
      });
    });
  });
});

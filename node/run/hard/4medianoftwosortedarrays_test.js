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
        assert.deepEqual(actual, expect);
      });

      it('should complete return median = 2.5', async () => {
        const expect = 2.5;
        const nums1 = [1, 2];
        const nums2 = [3, 4];
        const actual = findMedianSortedArrays(nums1, nums2);
        assert.deepEqual(actual, expect);
      });

      it('should complete return median = 2.0 for undefined', async () => {
        const expect = 2.0;
        const nums1 = [2];
        const nums2 = [];
        const actual = findMedianSortedArrays(nums1, nums2);
        assert.deepEqual(actual, expect);
      });


      it('should complete return median = 2.5 for undefined', async () => {
        const expect = 2.5;
        const nums1 = [];
        const nums2 = [1, 2, 3, 4];
        const actual = findMedianSortedArrays(nums1, nums2);
        assert.deepEqual(actual, expect);
      });

      it('should complete return median = 10.5 for undefined', async () => {
        const expect = 10.5;
        const nums1 = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22];
        const nums2 = [0,6];
        const actual = findMedianSortedArrays(nums1, nums2);
        assert.deepEqual(actual, expect);
      });
    });
  });
});

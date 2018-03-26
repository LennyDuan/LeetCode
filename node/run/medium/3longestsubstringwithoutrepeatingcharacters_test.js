import { lengthOfLongestSubstring } from '../../app/medium/3longestsubstringwithoutrepeatingcharacters';
import { assert } from 'chai';

describe('medium', () => {
  describe('longestsubstringwithoutrepeatingcharacters', () => {
    describe('lengthOfLongestSubstring', () => {
      it('should complete return abc = 3', async () => {
        const expect = 3;
        const given = 'abcabcbb';
        const actual = lengthOfLongestSubstring(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return b = 1', async () => {
        const expect = 1;
        const given = 'bbbbb';
        const actual = lengthOfLongestSubstring(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return wke = 3', async () => {
        const expect = 3;
        const given = 'pwwkew';
        const actual = lengthOfLongestSubstring(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return tmmzuxt = 5', async () => {
        const expect = 5;
        const given = 'tmmzuxt';
        const actual = lengthOfLongestSubstring(given);
        assert.deepEqual(expect, actual);
      });
    });
  });
});

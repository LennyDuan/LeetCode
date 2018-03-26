import { assert } from 'chai';
import { longestPalindrome } from '../../app/medium/5longestpalindromicsubstring';

describe('medium', () => {
  describe('longestpalindromicsubstring', () => {
    describe('longestPalindrome', () => {
      it('should complete return bab', async () => {
        const expect = 'bab';
        const given = 'babad';
        const actual = longestPalindrome(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return bb', async () => {
        const expect = 'bb';
        const given = 'cbbd';
        const actual = longestPalindrome(given);
        assert.deepEqual(expect, actual);
      });
    });
  });
});

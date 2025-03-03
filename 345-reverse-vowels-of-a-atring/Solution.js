/**
 * @param {string} s
 * @return {string}
 */

// Time Complexity - O(N)
var reverseVowels = function (s) {
    const vowels = ['e', 'E', 'u', 'U', 'i', 'I', 'o', 'O', 'a', 'A'];
    const vowelsOfWord = extractCharactersFromWord(s, vowels);
    // leetcode - vowelsOfWord = [e,e,o,e]

    let vowelIndex = vowelsOfWord.length - 1;
    let result = "";

    for (let i = 0; i < s.length; i++) {
        if (vowels.includes(s[i])) {
            result += vowelsOfWord[vowelIndex--];
        } else {
            result += s[i];
        }
    }

    return result;
};

const extractCharactersFromWord = function (word, chars) {
    const result = [];
    for (let letter of word) {
        if (chars.includes(letter)) {
            result.push(letter)
        }
    }

    return result;
}
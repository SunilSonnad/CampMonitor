
describe('String startswith', function () {
    it('checks if the string starts with given substring', function () {
        expect("Campaign Monitor".startswith("Camp")).toEqual(true);
    });
});

describe('String startswith', function () {
    it('checks string start but does not.', function () {
        expect("Campaign Monitor".startswith("Monitor")).toEqual(false);
    });
});

describe('String startswith', function () {
    it('checks starts with non-alphabetic characters', function () {
        expect("&*#@([Hello> World!".startswith("&*#@([Hello>")).toEqual(true);
    });
});

describe('String startswith', function () {
    it('checks starts with empty string', function () {
        expect("".startswith("")).toEqual(true);
    });
});

describe('String endswith', function () {
    it('checks if the string ends with given substring', function () {
        expect("Hello".endswith("llo")).toEqual(true);
    });
});

describe('String endswith', function () {
    it('checks string ends but does not.', function () {
        expect("Campaign Monitor".endswith("Camp")).toEqual(false);
    });
});

describe('String endswith', function () {
    it('checks ends with non-alphabetic characters', function () {
        expect("Hello> World!&*#@([".endswith("&*#@([")).toEqual(true);
    });
});

describe('String endswith', function () {
    it('checks ends with empty string', function () {
        expect("".endswith("")).toEqual(true);
    });
});


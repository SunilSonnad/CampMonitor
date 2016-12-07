String.prototype.startswith = function(prefix) {
	return this.indexOf(prefix) === 0;
}

String.prototype.endswith = function(suffix) {
	if (this.length < suffix.length)
		return false;
	return this.lastIndexOf(suffix) === this.length - suffix.length;
}
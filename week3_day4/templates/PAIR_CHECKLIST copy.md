# Pair review checklist (Thursday)

**Reviewer name:** Kaitlyn **Author / track:** B
- [x] Code runs without stack traces on happy path.
- [x] Collection choice matches README (Map / Set / Queue).
- [ ] No raw `System.out` debugging left in place of logging (after Phase 3).
- [ ] **equals/hashCode** if custom objects used inside **HashMap**/**HashSet** (N/A for String keys). (not applicable)
- [x] One **specific** suggestion for readability or naming.

**Written feedback (2–3 sentences):**

Logging still uses raw `System.out`. The predicate and comparator are clean and well-named. descriptionOrder might be a candidate for renaming as it doesn't describe how the descriptions are sorted (alphabetical/ascending/descending?), but renaming it isn't strictly necessary. 
